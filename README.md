# 🏦 Microservice de Gestion des Comptes Bancaires
### gRPC • Spring Boot • Protobuf

Ce projet met en place un **microservice bancaire** basé sur une architecture moderne, combinant **gRPC** pour les échanges réseau et **Spring Boot** pour la logique métier ainsi que la gestion des données.

L’objectif est de proposer un service rapide, structuré et typé pour la gestion des comptes bancaires.

---

## 🎯 Vue d’ensemble

Le microservice permet de :
- gérer des comptes bancaires,
- exposer des services RPC performants,
- centraliser la logique métier côté serveur,
- utiliser une base de données embarquée pour les tests et le développement.

---

## 🔌 API gRPC exposée

Le service gRPC fournit les opérations suivantes :

### 📌 1. AllComptes
Retourne l’ensemble des comptes bancaires enregistrés.

### 📌 2. CompteById
Permet d’obtenir les informations d’un compte précis à partir de son identifiant.

### 📌 3. TotalSolde
Calcule et retourne des statistiques globales :
- nombre total de comptes,
- somme des soldes,
- solde moyen.

### 📌 4. SaveCompte
Crée un nouveau compte ou met à jour un compte existant.

---

## ⚙️ Technologies utilisées

| Composant | Choix |
|---------|------|
| Langage | Java 17 |
| Framework | Spring Boot 3.4.0 |
| Communication | gRPC (Protocol Buffers v3) |
| Persistance | Base H2 (In-memory) |
| Build | Maven |
| Environnement | Windows 64 bits |

---

## 🧱 Architecture du projet

L’organisation du projet suit une structure claire et modulaire :

```text
src/
├── main/
│   ├── proto/
│   │   └── CompteService.proto      # Contrat gRPC (messages + services)
│   │
│   └── java/
│       └── org/example/grpc2/
│           ├── controllers/         # Implémentation des méthodes gRPC
│           ├── entities/             # Entités JPA (Compte, etc.)
│           ├── repositories/         # Accès aux données (Spring Data JPA)
│           ├── services/             # Logique métier
│           └── stubs/                # Code généré par Protobuf
