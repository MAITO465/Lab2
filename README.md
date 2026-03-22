#  Estimateur de Taxes Locales - Android

##  Description
Cette application mobile permet de simuler le montant des impôts locaux pour une habitation en fonction de critères physiques. Ce projet a été réalisé dans le cadre d'un module de développement mobile pour démontrer la gestion des entrées utilisateurs et la logique métier simple.

##  Aperçu de l'Interface
<img width="391" height="866" alt="Screenshot 2026-03-22 182747" src="https://github.com/user-attachments/assets/bb9bcb26-51a0-4151-960d-56260001bc77" />

*Interface utilisateur optimisée avec validation de saisie et rendu monétaire formaté.*

##  Caractéristiques Techniques
- **Gestion des exceptions** : Implémentation d'un bloc `try-catch` pour éviter les plantages lors de saisies invalides.
- **Validation de formulaire** : Vérification de la présence de données avant le lancement du calcul.
- **UI Responsive** : Utilisation d'une `ScrollView` pour garantir l'accessibilité sur tous les formats d'écrans.
- **Modularité** : La logique de calcul est séparée de la gestion de l'interface (méthode `calculerImpot`).

##  Paramètres du Calcul
L'algorithme de calcul repose sur les barèmes suivants :
* **Base Surface** : 2.0 DH par m².
* **Base Pièces** : 50.0 DH par pièce déclarée.
* **Option Piscine** : Forfait fixe de 100.0 DH en cas de présence d'un bassin.

##  Installation
1. Importer le dossier dans **Android Studio**.
2. Synchroniser le projet avec **Gradle**.
3. Déployer sur un terminal virtuel ou physique (API 24 minimum).

---
*Projet académique - Focus sur la robustesse du code et la clarté de l'interface.*
