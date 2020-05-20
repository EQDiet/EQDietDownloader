/**
 * EQDiet Downloader coded by Daniel Lopez Tena.
 * (C) 2020, Daniel Lopez Tena
 * Special thanks to:
 * - user4257136 on www.stackoverflow.com for publishing createDesktopShortcut code!
 * - Jim McBeath on github.com for publishing jimmc package!
 * - baeldung on www.baeldung.com for publishing Download code!
 * - and you for using our application!
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import net.jimmc.jshortcut.JShellLink; //Package that makes possible to create aplication shortcuts

public class EQDietDownloader extends javax.swing.JFrame{
    
    byte DownloadSourceCode;
    byte InstallationDone;
    short selectcount;
    int error;
    JShellLink link;
    String filePath;
    String installdir;
    String PRJT_PATH;
    String filename;
    String fileversion;
    
    public void GetVariables(){
        /////////// This creates the installation directories in %AppData% dir //////////////////
        File directory = new File(System.getProperty("user.home"), "\\AppData\\Roaming\\EQDiet");
        directory.mkdir();
        installdir = System.getProperty("user.home") + "\\AppData\\Roaming\\EQDiet\\";
        File datadir = new File(System.getProperty("user.home"), "\\AppData\\Roaming\\EQDiet\\Data");
        datadir.mkdir();
        /////////////////////////////////////////////////////////////////////////////////////////
        /////////// This cobtains the directory to create a shortcut of the app /////////////////
        getdir();
        /////////////////////////////////////////////////////////////////////////////////////////
    }
    
    public void GetFileName(){
        try {
            FileReader flE=new FileReader(installdir + "Data\\Version.txt");
            try (BufferedReader fE = new BufferedReader(flE)) {
                filename = fE.readLine();
                fE.close();
            }
        } catch (FileNotFoundException ex) {
            jLabel5.setText("Error checking version");
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            jLabel5.setText("Error checking version");
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void GetFileVersion(){
        try {
            FileReader f2E = new FileReader(installdir + "Data\\VersionNumber.txt");
            try (BufferedReader f2 = new BufferedReader(f2E)) {
                fileversion = f2.readLine();
                f2.close();
            }
        } catch (FileNotFoundException ex) {
            jLabel5.setText("Error checking version");
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            jLabel5.setText("Error checking version");
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Download(String downloadfile, String downloadname){ // Thanks baeldung on www.baeldung.com for publishing this code
        jLabel5.setText("Installing: " + downloadname);
        try (BufferedInputStream in = new BufferedInputStream(new URL(downloadfile).openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(installdir + downloadname)) {
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
        } catch (IOException e) {
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, e);
            jLabel5.setText("Error while downloading");
            error = 1;
        }
    }
    
    @SuppressWarnings("MismatchedReadAndWriteOfArray")   
    private void getdir(){ // Thanks user4257136 on www.stackoverflow.com for publishing this code
        File f=new File(installdir);
        File[] f1=f.listFiles();
        try {
            PRJT_PATH=f.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
            jLabel5.setText("Error creating shortcut.");
        }
    }

    public void createDesktopShortcut(){ // Thanks user4257136 on www.stackoverflow.com for publishing this code
        try {
            link = new JShellLink();
            filePath = JShellLink.getDirectory("") + PRJT_PATH + "\\EQDiet" + filename + ".exe";
        } catch (Exception e) {
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, e);
            jLabel5.setText("Error creating shortcut.");
        }
        try {
            link.setFolder(JShellLink.getDirectory("desktop"));
            link.setName("EQDiet" + filename);
            link.setPath(filePath); //Link for our executable jar file
            link.setIconLocation(PRJT_PATH+ "\\Data\\EQDiet.ico"); //Set icon image
            link.save();
        } catch (Exception ex) {
            Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
            jLabel5.setText("Error creating shortcut.");
        }
    }
    
    public EQDietDownloader() {
        initComponents();
        DownloadSourceCode = 0;
        InstallationDone = 0;
        selectcount = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Fatal error");
        jFrame1.setLocation(new java.awt.Point(45, 35));
        jFrame1.setResizable(false);
        jFrame1.setType(java.awt.Window.Type.POPUP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EQDiet Downloader 1.0 successfully crashed");

        jButton2.setText("Send report");
        jButton2.setEnabled(false);

        jButton3.setText("Don't send report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reason:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Your clicks are annoying me");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EQDiet Downloader");
        setLocation(new java.awt.Point(40, 30));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EQDiet Downloader 1.0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Installation progress:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Download and install");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("eqdiet.weebly.com");

        jLabel5.setText("Installing: Waiting for action");

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Basic app");
        jRadioButton1.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Additional installation options:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Install:");

        jRadioButton2.setText("Source code");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(InstallationDone == 1){
            System.exit(0);
        }
        GetVariables();
        // Downloads EQDiet's files
        Download("https://drive.google.com/uc?export=download&id=1qUYHj-cp9SR7HwZl8vSkY2JkqTenseTs", "Data\\Version.txt");
        Download("https://drive.google.com/uc?export=download&id=1guxv_CaLZfd8JwbCLmk69v3L50g1NE39", "Data\\VersionNumber.txt");
        GetFileName();
        GetFileVersion();
        if(DownloadSourceCode == 1){ // Checks if the user marked the option to download EQDiet's source code
            Download("https://github.com/EQDiet/EQDiet" + filename + "/releases/download/" + fileversion + "/EQDiet" + filename + ".exe", "EQDiet" + filename + ".exe");
            Download("https://drive.google.com/uc?export=download&id=1FTz1a2WWUdH8tjqEx7AUVdR1lHHBMxJK","Data\\EQDiet.ico");
            Download("https://codeload.github.com/EQDiet/EQDiet" + filename + "/zip/master", "EQDiet" + filename +"-master.zip");
            Download("https://camo.githubusercontent.com/baef41cbc6df7be9dfe9c9ee90bf7a02a638a90c/68747470733a2f2f6571646965742e776565626c792e636f6d2f75706c6f6164732f312f322f322f372f3132323738363934312f6571646965745f6f7269672e706e67", "Data\\EQDiet.png");
        }else{
            Download("https://github.com/EQDiet/EQDiet" + filename + "/releases/download/" + fileversion + "/EQDiet" + filename + ".exe", "EQDiet" + filename + ".exe");
            Download("https://drive.google.com/uc?export=download&id=1FTz1a2WWUdH8tjqEx7AUVdR1lHHBMxJK","Data\\EQDiet.ico");
            Download("https://camo.githubusercontent.com/baef41cbc6df7be9dfe9c9ee90bf7a02a638a90c/68747470733a2f2f6571646965742e776565626c792e636f6d2f75706c6f6164732f312f322f322f372f3132323738363934312f6571646965745f6f7269672e706e67", "Data\\EQDiet.png");
        }
        if(error != 1){
            for(int i=0; i<=100; i++){
                jProgressBar1.setValue(i);
            }
            jLabel5.setText("Installing: Complete!");
            createDesktopShortcut();
            InstallationDone = 1;
            jButton1.setText("Exit EQDietDownloader");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(selectcount >= 10){
            jRadioButton2.setText("Please decide soon!");
            if(selectcount >= 20){
                jRadioButton2.setText("I am getting angry!");
                if(selectcount >= 30){
                    jFrame1.setSize(375, 190);
                    jFrame1.setVisible(true);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EQDietDownloader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dispose();
                }
            }
        }
        if(DownloadSourceCode == 0){
            DownloadSourceCode = 1;
            selectcount++;
        }else{
            DownloadSourceCode = 0;
            selectcount++;
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EQDietDownloader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EQDietDownloader().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
