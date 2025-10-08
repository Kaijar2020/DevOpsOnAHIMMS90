# DevOpsOnAHIMMS90 CI Stability

A hybrid testing framework for AHIMMS90 with continuous integration capabilities.

## Project Overview

This project implements a hybrid testing framework for automated testing of AHIMMS90 system, integrated with CI/CD pipelines using GitHub Actions.

## Tech Stack

- Java
- Maven
- GitHub Actions
- Hybrid Testing Framework

## Project Structure

```
.
├── src/
│   ├── main/java/org/hybrid/framework/
│   │   └── Main.java
│   └── test/java/
│       └── TestUrl.java
├── .github/workflows/
│   └── maven-java-tests.yml
└── pom.xml
```

## Setup and Installation

1. Clone the repository:
```bash
git clone https://github.com/Kaijar2020/DevOpsOnAHIMMS90.git
```

2. Ensure you have the following prerequisites:
   - Java JDK 8 or higher
   - Maven
   - Git

3. Install dependencies:
```bash
mvn clean install
```

## Running Tests

To run the tests locally:
```bash
mvn test
```

## CI/CD Pipeline

The project uses GitHub Actions for continuous integration. The workflow is defined in `.github/workflows/maven-java-tests.yml` and includes:
- Automated build and test execution
- Test result reporting
- Quality checks

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is proprietary and maintained by Kaijar2020.

## Contact

- Owner: Kaijar2020
- Repository: DevOpsOnAHIMMS90
