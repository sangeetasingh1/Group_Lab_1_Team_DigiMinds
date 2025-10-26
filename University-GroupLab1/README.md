# 🎓 Digital University System  
*(Administration, Faculty, and Student Modules)*

---

## 🏷️ Project Title  
**Digital University System**  

---

## 👥 Team Information  

| Name | NUID | Role | Responsibilities |
|------|------|------------------|------|
| [Sangeeta Singh] | [002082071] | Administration Use Case | Administer user accounts (create, modify, and delete accounts), Register persons (students, faculty, academic staff), Manage student records (update, delete, or view student data), Manage faculty records (update, delete, or view faculty data), Manage own profile |
| [Jamie Gist] | [003182426] | Faculty Use Case | Manage courses (view, update course details), Manage faculty member profile, Generate performance reports (student grades in the class), Manage student profiles (view hobbies, interests, academic progress) |
| [Jafaeth Gomez] | [003189253] | Student Use Case | Manage coursework (submit assignments, track progress), Register for classes (enroll, drop courses), Perform graduation audit (track credits and graduation requirements), Review transcript (view academic history) |

---

## 📖 Project Overview  

The **University Management System (UMS)** is developed to simplify and automate key administrative, faculty, and student-related processes within a university environment.  
It provides **role-based access** to ensure secure and efficient management of academic and administrative tasks.  

### 🎯 Objectives  
- Automate administrative operations.  
- Provide secure authentication and access control for Administrators, Faculties and Students  
- Enable smooth interaction between administration, faculty, and students.  

### 🔑 Key Features  
- Multi-role authentication (Admin, Faculty, Student)  
- Course and user management  
- Performance tracking  
- Notifications and announcements  

---

## ⚙️ Installation & Setup Instructions  

### 🧩 Prerequisites  
- **Java JDK 17+**  
- **Apache Tomcat 10**   
- **NetBeans IDE**  
- **Ant**  
- **Git**

### 🪜 Setup Steps  
1. **Clone the Repository**
   ```bash
   git clone https://github.com/sangeetasingh1/Group_Lab_1_Team_DigiMinds/tree/main/University-GroupLab1

2. **Open Project in NetBeans**
Go to File → Open Project and select the cloned folder.

3. **Main Class setup for run**
Go to Project → Open project Properties → Select Run → Select the main class to define entry for project → **university.UserInterfaces.WorkAreas.ProfileWorkAreaMainFrame**

4. **Running Project**
Right click on Project → Click on Run option (It will invoke the main class configured at step 3 above)

### 🪜 Authentication & Access Control
Secure login via username and password mapped with the specific role
Logout supported with disposal and recreation.

### 🪜 Authorization Rules
Admin → Administer user accounts (create, modify, and delete accounts), Register persons (students, faculty, academic staff), Manage student records (update, delete, or view student data), Manage faculty records (update, delete, or view faculty data), Manage own profile 
Faculty → Manage courses (view, update course details), Manage faculty member profile, Generate performance reports (student grades in the class), Manage student profiles (view hobbies, interests, academic progress) 
Student → Manage coursework (submit assignments, track progress), Register for classes (enroll, drop courses), Perform graduation audit (track credits and graduation requirements), Review transcript (view academic history) 

### 🪜 Features Implemented
**Admin Use Case**
    🪜 Administer user accounts (create, modify, and delete accounts)
    🪜 Register persons (students, faculty, academic staff)
    🪜 Manage student records (update, delete, or view student data) 
    🪜 Manage faculty records (update, delete, or view faculty data)
    🪜 Manage own profile
    **Developed by: [Sangeeta Singh] | [002082071]**

**Faculty Use Case**
    🪜 Manage courses (view, update course details)
    🪜 Manage faculty member profile
    🪜 Generate performance reports (student grades in the class)
    🪜 Manage student profiles (view hobbies, interests, academic progress) 
    **Developed by: [Jamie Gist] | [003182426]**

**Student Use Case**
    🪜 Manage coursework (submit assignments, track progress),
    🪜 Register for classes (enroll, drop courses),
    🪜 Perform graduation audit (track credits and graduation requirements),
    🪜 Review transcript (view academic history) 
    **Developed by: [Jafaeth Gomez] | [003189253]**

### 🪜 Usage Instructions
**Login with assigned credentials.**
    🪜 Access Dashboard based on your role:
        Admin: Manage users (Employee, Faculty, Students)
        Faculty: Manage Courses
        Student: Manage Coursework
    🪜 Perform Assigned Tasks.

    🪜 Logout securely when done.

### Testing Guide
**How to Test**
    🪜 Use the test accounts using credentials:
        Admin:      userName: admin 
                    Password: ****
        Faculty:    userName: faculty 
                    Password: ****
        Student:    userName: student 
                    Password: ****

    🪜 Validate:
        Login/Logout works properly
        Access control per role is correctly restricted

### Challenges & Sollutions
**Role-based Navigation**
    Developed dynamic routing based on the Profile role and instance of the class





    
