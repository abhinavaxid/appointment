# 🏥 Clinic Appointment System

A full-stack Java web application for managing clinic patient registrations and appointment bookings using Spring Boot, Thymeleaf, and PostgreSQL.

---

## 📌 Features

- ✅ Patient registration with location selectors (state → city)
- 🕐 Book doctor appointments with department and hospital selection
- 🧾 Appointment confirmation with all selected details
- 👨‍⚕️ Doctor login to view assigned appointments and manage prescriptions
- 🗂️ Admin-ready structure with master tables for hospitals, departments, and doctors

---

## ⚙️ Tech Stack

| Layer       | Technology               |
|-------------|---------------------------|
| Backend     | Spring Boot 3.4.5         |
| Language    | Java 21                   |
| Frontend    | Thymeleaf + Bootstrap     |
| ORM         | Spring Data JPA (Hibernate) |
| Database    | PostgreSQL 17             |
| Build Tool  | Maven                     |
| Utilities   | Lombok                    |

---

## 🏗️ Project Structure

src/
└── main/
├── java/
│ └── com.example.appointment
│ ├── controller
│ ├── model
│ ├── repository
│ └── service
└── resources/
├── templates/ (Thymeleaf views)
└── application.properties

yaml
Copy
Edit

---

## 📋 Setup Instructions

### 1. Clone the Repository

```bash```

git clone https://github.com/abhinav/appointment.git
cd clinic-appointment-system
2. Set Up PostgreSQL

Install PostgreSQL 17+

Create a database named APS

Run the provided SQL scripts:

The Schema will be created itself on the first run 

✅ These include tables for patients, doctors, departments, hospitals, etc., with 10 dummy records each (India-based).

3. Configure application.properties
Edit src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/clinic
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Build & Run
bash
Copy
Edit
mvn clean install
mvn spring-boot:run
5. Access the App
Patient Registration: http://localhost:8080/register

Appointment Booking: http://localhost:8080/appointments/book

🧪 Testing
Register a patient → copy the registration ID

Book an appointment using that ID

View success confirmation with appointment details
