# Installation overview

The following text will guide you through the process of installation. 

## Prerequisites

- Install the newest Java Development Kit (JDK). Use the [official website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and follow the instructions.
- Download the [Palladio Drop](https://sdqweb.ipd.kit.edu/eclipse/palladiobench/binary_nightly/) (Eclipse instance with Palladio) according to the Operation System you are using. For now, you will use the nightly build as the Palladio Version 4 (Stable Version) uses an old version of PCM editors within Eclipse. 

## Installation
- Unpack the zip folder
- Open Palladio (Double Klick on PalladioBench.exe)
- Use an existing Workspace or create a new one
- File -> New -> Project -> Sirius -> Modeling Project -> Next
- Enter a project name -> Finish
- Navigate to the workspace and open the folder of the project you created
- Clone the "models" [GitHub repository](https://github.com/cocome-community-case-study/models/tree/master/PCMWithSEFFs). You only need the folder named "PCMWithSEFFs". Copy following files into your project folder.
  - cloud-cocome-git.system
  - cocome-cloud-git.repository
  - representations.aird  
- Restart your eclipse/palladio instance. You are now ready to work with the model.

## Adding Tree Editor
You can add a useful tree editor to your Palladio Drop. 
 
- Open Eclipse -> Help -> Install new software -> Work With: Palladio Update Site
- Palladio Bench Core Feature -> Palladio Component Model - Tree Editor
- Palladio Bench Core Feature Sources -> Palladio Component Model - Tree Editor
- Follow the upcoming instructions, accept agreements and install software

Now you can double click on cocome-cloud-git.repository to open the tree editor based overview.


## Using Palladio Bench 4.0 (Stable Version)
If you want to use the older version of Palladio (4.0, stable) you need to change a few numbers in the .system, .repository and .aird files. This [website](https://sdqweb.ipd.kit.edu/wiki/PCM_4.0#Palladio_Bench_4.0_Product_Builds) gives you an overview about the stable Version. You can download Palladio via this [link](https://sdqweb.ipd.kit.edu/eclipse/palladiobench/releases/4.0.0/). The installation is similar to the normal installation explained above.

###Changing the version numbers
As the current version of Palladio (Nigthly build) uses the PCM Version 5.2, but the Palladio 4.0 uses 5.1, you need to adapt the following files: cloud-cocome-git.system, cocome-cloud-git.repository, representations.aird.
The easiest way to change the version numbers is to use NotePad++ or a similar program.
Repeat the following steps for each of the following files: 
 
- Open the file in your workspace
- Search EACH occurence of "5.2" and replace it by "5.1" 
- Save the file and continue with the others


