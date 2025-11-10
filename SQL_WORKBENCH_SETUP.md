# MySQL Workbench Setup Guide

## Prerequisites
1. **Download and Install MySQL Server**
   - Download from: https://dev.mysql.com/downloads/mysql/
   - Choose "MySQL Installer for Windows"
   - During installation, set a root password (remember this!)
   - Default port: 3306

2. **Download and Install MySQL Workbench** (if not already installed)
   - Download from: https://dev.mysql.com/downloads/workbench/
   - Or install via MySQL Installer

## Configuration Steps

### 1. Update application.properties
The `application.properties` file has been updated. **IMPORTANT**: Replace `your_mysql_password` with your actual MySQL root password.

```properties
spring.datasource.password=your_mysql_password
```

### 2. Create Database in MySQL Workbench (Optional)
The application will create the database automatically, but you can also create it manually:

1. Open MySQL Workbench
2. Connect to your local MySQL server (localhost:3306)
3. Run this SQL command:
```sql
CREATE DATABASE IF NOT EXISTS vehicle_db;
```

### 3. Verify Connection
In MySQL Workbench, run:
```sql
SHOW DATABASES;
```
You should see `vehicle_db` in the list after running your application.

## Running the Application

1. Make sure MySQL Server is running (check Windows Services or MySQL Workbench)
2. Update the password in `application.properties`
3. Run the Spring Boot application
4. Check MySQL Workbench to see the created tables

## Troubleshooting

### Connection Refused
- Make sure MySQL Server is running
- Check if MySQL is running on port 3306
- Verify your username and password

### Access Denied
- Check your MySQL username (default: root)
- Verify your MySQL password in `application.properties`

### Database Not Created
- Check the connection URL includes `createDatabaseIfNotExist=true`
- Or manually create the database in MySQL Workbench

## Viewing Data in MySQL Workbench

After running your application:
```sql
USE vehicle_db;
SHOW TABLES;
SELECT * FROM vehicle;
```

## Default Configuration
- **Host**: localhost
- **Port**: 3306
- **Database**: vehicle_db
- **Username**: root
- **Password**: (set in application.properties)
