# 🚗 Abstract Factory Vehicle System – Java

A Java implementation of **Abstract Factory** and **Singleton** design patterns developed for the **SLIIT OOP (Object-Oriented Programming)** module.  
This project simulates a **Vehicle Factory** that produces **Cars** and **Buses** from specific factories.

---

## 📚 Project Overview

This system demonstrates the use of:
- **Abstract Factory Pattern** → To create families of related objects (CarFactory and BusFactory).
- **Singleton Pattern** → To ensure only one instance of each factory and vehicle type exists.
- **Interfaces** → To achieve loose coupling between products (Cars and Buses).

---

## 🧱 Class Structure Overview

### **1️⃣ VehicleProducer**
- Acts as the abstract factory selector.
- Returns `CarFactory` or `BusFactory` via the `getVehicle(String choice)` method.

### **2️⃣ CarFactory & BusFactory**
- Implement the **Singleton Pattern**.
- Provide the `getModel(String vehicle)` method to return the correct car or bus object.

### **3️⃣ Car Models**
- `BMW`, `Benz`, and `RollsRoyce`
- Each follows **Singleton** design and implements `ICar` interface.
- Each overrides the `displayVehicle()` method.

### **4️⃣ Bus Models**
- `Volvo`, `Fuso`, and `TATA`
- Each follows **Singleton** design and implements `IBus` interface.
- Each overrides the `displayVehicle()` method.

### **5️⃣ Interfaces**
- `ICar`: Declares `displayVehicle()` for car models.
- `IBus`: Declares `displayVehicle()` for bus models.
- `VehicleFactory`: Declares `getModel(String vehicle)` for factory classes.

### **6️⃣ VehicleDemo (Main Class)**
- Demonstrates factory selection and vehicle creation:
  ```java
  VehicleFactory carFactory = VehicleProducer.getVehicle("Car");
  ICar car1 = (ICar) carFactory.getModel("BMW");
  car1.displayVehicle();
  
| Pattern                   | Purpose                                                      |
| ------------------------- | ------------------------------------------------------------ |
| **Abstract Factory**      | To encapsulate creation of related vehicle families          |
| **Singleton**             | To ensure a single shared instance of each factory and model |
| **Interface Segregation** | To separate car and bus behaviors clearly                    |

⚙️ How to Run

Clone the Repository

git clone https://github.com/dyneth02/AbstractFactory-VehicleSystem-Java.git
cd AbstractFactory-VehicleSystem-Java


Compile the Java Files

javac *.java


Run the Demo

java VehicleDemo


Expected Output Example

--- Vehicle Factory Demo ---
Selected Factory: CarFactory
BMW: Luxury performance car displayed.
Benz: Premium comfort car displayed.
RollsRoyce: Ultimate luxury car displayed.

Selected Factory: BusFactory
Volvo: City transport bus displayed.
Fuso: Commercial transport bus displayed.
TATA: Long-distance travel bus displayed.

🧠 Concepts Demonstrated

Abstract Factory Pattern
Singleton Pattern
Factory Method Pattern
Polymorphism and Interfaces
Encapsulation and Object Reuse
