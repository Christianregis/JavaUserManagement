# JavaUserManagement

## 📌 Description générale

**JavaUserManagement** est une application Java de gestion des utilisateurs.  
Le projet est structuré en **deux versions distinctes**, permettant de comparer une gestion des données **en mémoire** et une gestion **persistante avec une base de données MySQL**.

Chaque version est indépendante et se trouve dans un dossier dédié.

---

## 🗂️ Structure du projet

JavaUserManagement/
│
├── MapVersion/
│ └── (Version avec stockage en mémoire)
│
├── MySQLVersion/
│ ├── src/
│ ├── target/
│ │ └── report/
│ │ └── apidocs/
│ │ └── index.html
│ └── (Version avec base de données MySQL)
│
└── README.md

---

## 🧩 Les deux versions du projet

### 🔹 1. Version Map (MapVersion)

- Les données utilisateurs sont stockées **en mémoire** à l’aide de structures Java (`Map`).
- Aucune base de données n’est utilisée.
- Idéale pour :
  - Comprendre la logique métier
  - Tester rapidement l’application
  - Les démonstrations pédagogiques

📁 Dossier concerné :  
MapVersion/

---

### 🔹 2. Version MySQL (MySQLVersion)

- Les données utilisateurs sont stockées dans une **base de données MySQL**.
- Utilise **Spring Boot**, **JPA (Hibernate)** et **MySQL**.
- La base de données utilisée s’appelle :  
usermanagement


📘 **Documentation technique (Javadoc)** :  
Après génération, elle est accessible ici :
MySQLVersion/target/report/apidocs/index.html


---

## 🛠️ Prérequis

Avant d’installer ou d’exécuter l’application, assure-toi d’avoir :

- ☕ **JDK 17** (obligatoire)
- 🧰 **Maven**
- 🗄️ **MySQL Server** (pour la version MySQL uniquement)
- 🌐 **Git**
- 💻 Un IDE Java (IntelliJ IDEA, Eclipse ou Visual Studio Code)

Vérification rapide :
```bash
java -version
javac -version
mvn -version
** Installation de la version MYSQL**
git clone https://github.com/TON_UTILISATEUR/JavaUserManagement.git
cd JavaUserManagement

** Installation de la version MYSQL**
git clone https://github.com/TON_UTILISATEUR/JavaUserManagement.git
cd MapVersion
mvn clean install

Via PhpMyAdmin
CREATE DATABASE usermanagement;
cd MySQLVersion

Via VSCode ou Intelligi IDE
mvn clean install
mvn spring-boot:run

👤 Auteur

Regis CHEUKAP TATOUN
Projet académique en Java & Spring Boot
