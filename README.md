# EQDiet Downloader 1.0
Downloads the latest version of EQDiet

Welcome to EQDiet Downloader version 1.0. Hope you enjoy using our app! You can visit our website [here](https://eqdiet.weebly.com)

#### Atention! This is not EQDiet app, this is an external app that downloads EQDiet app. If you want EQDiet App, visit our website [here](https://eqdiet.weebly.com/downloads.html) or our GitHub repositories [here](https://github.com/EQDiet).

We have recently released new product pages. You can see EQDiet Downloader's one at [this link](https://eqdiet.weebly.com/eqdiet-downloader.html)

To know more about this release, visit [this link](https://eqdiet.weebly.com/release-notes/released-eqdiet-downloader-10)

![Image of EQDiet](https://eqdiet.weebly.com/uploads/1/2/2/7/122786941/eqdiet_orig.png)

## Building the source code

### Requirements

#### Necessary requirements

- Latest Java SE Development Kit (JDK). Click [here](https://lumi.gq/jdk) if you don't have it.

#### Optional requirements

- EQDiet Icon. Click [here](https://drive.google.com/uc?export=download&id=1FTz1a2WWUdH8tjqEx7AUVdR1lHHBMxJK) to get it.
- Launch4j to convert jar file to exe file. You can download it using EQDietCompiler.bat

### Build status
| [![EQDiet Compiler](https://github.com/EQDiet/EQDietDownloader1.0/workflows/EQDiet%20Compiler/badge.svg)](https://github.com/EQDiet/EQDietDownloader1.0/actions?query=workflow%3A%22EQDiet+Compiler%22) | [![Java Compiler (Javac)](https://github.com/EQDiet/EQDietDownloader1.0/workflows/Java%20Compiler%20(Javac)/badge.svg)](https://github.com/EQDiet/EQDietDownloader1.0/actions?query=workflow%3A%22Java+Compiler+%28Javac%29%22) | [![Build status](https://ci.appveyor.com/api/projects/status/0enp7yw0ipq03p3n?svg=true)](https://ci.appveyor.com/project/EQDiet/EQDietDownloader1-0) | [![Build Status](https://dev.azure.com/EQDiet/GitHub/_apis/build/status/EQDiet.EQDietDownloader1.0?branchName=master)](https://dev.azure.com/EQDiet/GitHub/_build/latest?definitionId=3&branchName=master) |
|:-:|:-:|:-:|:-:|

### Procedure

1. Set Java JDK bin folder to PATH. View [this video](https://www.youtube.com/watch?v=vhBNV8no4CI) if you don't know how to do it.
2. Download the source code by clicking "clone or download" button or by running this command:                          
`git clone https://github.com/EQDiet/EQDietDownloader1.0.git` (Only if you have GIT installed)
3. Extract the files to any folder if you used the firs method.
4. Open command prompt (cmd.exe).
5. Go to the destination folder you have extracted the files.
6. Run `EQDietCompiler.bat /Compile` to compile the source code. Capital letters and .bat extension are optional to execute this command.
7. Now you have compiled correctly EQDiet Downloader 1.0. Check your Build folder.
8. If you want to generate the executable JAR file, run `EQDietCompiler.bat /Jar` to compile it.
9. Your JAR file will be correctly generated at Release directory.
10. If you want to get the EXE file with the EQDiet icon, you need to install Launch4j.
11. Run `EQDietCompiler.bat /Launch4j` to download and install Launch4j.
12. If the installation was completed successfully, run Launch4j via start menu or by searching Launch4j on the search bar.
11. Choose "Output file" option to the folder you want and with the executable name with .exe extansion you want.
12. Choose "Jar" option to the Release folder you generated and the JAR file name with .jar extension.
13. Choose "Icon" option to the EQDiet icon you just have downloaded.
14. Go to JRE tab and write "1.8" in the "Min JRE version" option.
15. Click "Save configuration" icon.
16. It will write a XML file. Choose the name you want. When you compile the EXE file, you can delete it.
17. Click "Build wrapper" icon.
18. Done! Check the EXE output folder you have selected and now you will have an official copy of EQDiet Downloader 1.0!

### This project is protected by the MIT License. You can read it [here](https://github.com/EQDiet/EQDietDownloader1.0/blob/master/LICENSE).
**© 2020, EQDiet. - [eqdiet.weebly.com](https://eqdiet.weebly.com)**
