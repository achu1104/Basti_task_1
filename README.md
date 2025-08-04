# NGO Volunteer Android App

A simple Android application built in Java to help NGOs collect volunteer information and share details about their mission and goals.

## 📱 App Features

- **Home Screen**
  - NGO Name and Logo
  - Mission Statement
  - Buttons to navigate to Volunteer Form and About Us page

- **Volunteer Form**
  - Input fields for: Name, Contact Number, and City
  - Submit button with input validation
  - Shows a thank you toast upon successful submission

- **About Us Page**
  - Displays detailed information about the NGO
  - Scrollable text area for longer content

## 💻 Tech Stack

- **Language:** Java
- **IDE:** Android Studio
- **Minimum SDK:** API 21 (Android 5.0 Lollipop)
- **Layout:** XML-based UI
- **Navigation:** Intent-based between Activities

## 📂 Project Structure

NGOVolunteerApp/
├── java/com.example.ngovolunteerapp/
│ ├── MainActivity.java
│ ├── FormActivity.java
│ └── AboutUsActivity.java
├── res/layout/
│ ├── activity_main.xml
│ ├── activity_form.xml
│ └── activity_about_us.xml
├── res/drawable/
│ └── ngo_logo.png
├── AndroidManifest.xml

markdown
Copy
Edit

## 🚀 How to Run

1. Open Android Studio
2. Select **File > Open** and choose this project directory
3. Let Gradle sync finish
4. Click **Run ▶** to install and launch the app on an emulator or device

## 🔍 Screenshots

- **Main Screen**: NGO name, mission, logo, navigation buttons  
- **Form Screen**: Input for volunteer info, Submit button with validation  
- **About Us Screen**: Scrollable info about the NGO’s work and history


