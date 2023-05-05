<h1 align="center">Curriculum Vitae Builder Application</h1>
<p align="center">
    <img width="80px" src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExOGY0ZmFjY2ZhMTQ5YTMxZjBkNDIwOGYwOGVhZGYxZTgzM2Q4MDU0NCZlcD12MV9pbnRlcm5hbF9naWZzX2dpZklkJmN0PXM/POGZSdekmTv4MhuYaR/giphy.gif">
</p>

## Contents
- [Brief Description](#brief-description)
- [Languages and Tools](#languages-and-tools-in-this-project)
- [Project Details](#project-details)
- [Library Installation Guide](#library-installation-guide)

---
## Brief Description
- This is an application to _create your own resume_ **(user)** and _seek for jobs_ **(admin)**. 
- Project link (GitHub): [CurriculumVitaeBuilder](https://github.com/phamgiaphuc/CurriculumVitaeBuilder)
- Project's author: Pham Gia Phuc - Acus
- Personal profile: [MyProfile](https://github.com/phamgiaphuc)

## Languages and Tools in this project:
1. Java - Backend
2. JavaFX and CSS - Frontend
3. Docker
4. PostgreSQL
5. Object Oriented Programming
6. Maven
7. Other libraries or dependencies: [JavaMail](https://javaee.github.io/javamail/), [Java Dotenv](https://github.com/cdimascio/dotenv-java)
, [Slf4j](https://www.slf4j.org/)

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,postgresql,docker,css,maven,idea,github"/>
  </a>
</p>

## Project Details

## Library Installation Guide

### 1. pom.xml file
>**Notice:** After installing the dependencies to the **pom.xml file**, if the program does not run as expected, try to **clean**, **recompile** 
> and **reload** the file again.

<p align="center">
<img src="https://drive.google.com/uc?id=1k3Up8m0O8X71m90-fbEkxpUHk3jkTWWV">
</p>

### 2. Slf4j
- Add **this code** to your **pom.xml file**
```markdown
    <!--Slf4j-->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.7</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.26</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-simple</artifactId>
            <version>2.0.5</version>
        </dependency>
```
>**Advice:** Before you adopt SLF4J, I recommend that you read the concise [SLF4J user manual](https://www.slf4j.org/manual.html).

### 3. JavaMail
- Add **this code** to your **pom.xml file**
```markdown
    <!--JavaMail-->
        <dependency>
            <groupId>com.sun.mail</groupId>
            <artifactId>javax.mail</artifactId>
            <version>1.6.2</version>
        </dependency>
```
>**Advice:** Before you adopt JavaMail, I recommend that you read the concise [JavaMail user manual](https://javaee.github.io/javamail/).
- Due to Google policies about the [**Less secure apps**](https://support.google.com/accounts/answer/6010255?hl=en), I can not connect the program directly to the GMail Service.
The solution is to enable the [**2-Step Verification**](https://support.google.com/a/answer/6260879?hl=en#:~:text=For%20actions%20users%20can%20take,accounts%20and%20devices%20being%20compromised.) 
and use the **Apps Access Service** to connect the program to the GMail Service.
- Here is a tutorial video for how to enable the 2-Step Verification and Apps Access Service. Click [here](https://www.youtube.com/watch?v=qk8nJmIRbxk)

### 4. Java Dotenv
- Add **this code** to your **pom.xml file**
```markdown
    <!--Java Dotenv-->
        <dependency>
            <groupId>io.github.cdimascio</groupId>
            <artifactId>dotenv-java</artifactId>
            <version>3.0.0</version>
        </dependency>
```
>**Advice:** Before you adopt JavaMail, I recommend that you read the concise [Java Dotenv user manual](https://github.com/cdimascio/dotenv-java).
