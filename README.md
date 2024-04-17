# Daimler Compatibility Check Tool

## Overview

The Daimler Compatibility Check Tool is designed to streamline the process of comparing ODX-D and ODX-E files, aiding Daimler engineers in managing variants and configurations efficiently for their commercial vehicles. This tool automates the task of checking compatibility between the two files, saving time and improving accuracy for engineers.

## Features

- Parses ODX-D and ODX-E files to extract parameters.
- Compares parameters between the two files.
- Generates a CSV report indicating matching and non-matching parameters.
- Provides statistics on the number of matches, mismatches, and total parameters. 

## Usage

### Prerequisites

- Java Runtime Environment (JRE)
- Maven
- IntelliiJ IDEA or any Java IDE

### Installation

1. Clone the repository from the private GitHub repository provided by Daimler.
2. Open the project in IntelliJ or your preferred Java IDE.
3. Configure the IDE to recognize Maven as the dependency manager.
4. Enable annotation processing in the IDE settings and install the Lombok plugin.
5. Create a folder named "Output" under the `src` directory to store the parser output.

### Running the Tool

1. Locate the main method within the `ODX_D_Deserializer` class.
2. Run the main method to execute the program.
3. Follow the prompts to select the ODX-D and ODX-E files for comparison.
4. The tool will generate a CSV report containing compatibility information in the "Output" folder.

## Testing

The tool has been tested using unit tests and functionality tests to ensure reliability and effectiveness. Unit tests verify indidvidual components, while functional tests assess the overall functionality of the project.

## Limitations and Future Work

- The tool currently focuses on ODX-D and ODX-E files but can be expanded to support other ODX file types.
- Future iterations may involve extracting additional tags and converting the tool into an API for improved accessibility.
