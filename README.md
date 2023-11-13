# Phone Application

This Java application simulates the behavior of different phone models while adhering to a hierarchy of Phone classes and specific behavior requirements.

## Requirements

The application is designed to meet the following requirements:

- All phones offer the following behavior:
  - Create new contacts (as separate properties - create 2 contacts per phone).
  - View existing contacts.
  - Send text messages.
  - See all messages for a specific contact (as separate properties - create 2 messages per contact).
  - Make calls.
  - See all call history.

- Implement a hierarchy of Phone classes where:
  - A Phone can be of certain manufacturers and have a specific model (e.g., Phone - Samsung - SamsungGalaxyS6).
  - Properties that cannot change: battery life (in number of hours).
  - Properties that are configurable: color, material.
  - Properties that are instance-specific: IMEI.

- Additional behavior:
  - A message can have a maximum of 500 characters.
  - Every time a message is sent, an hour is deducted from the battery life.
  - Every time a call is made, two hours are deducted from the battery life.

## Usage

To use this application, follow these tasks:

1. Implement the necessary classes, abstract classes, and interfaces according to the given information.

2. Create at least two phone brands, each with two models. In the provided Java code, we have implemented the Samsung and SamsungGalaxyS6 classes as an example. You can extend this to include additional brands and models.

3. Create 2 new contacts using the `addContact` method.

4. Send a message to the first contact using the `sendMessage` method. Note that the maximum message length is 100 characters.

5. Make a call to the second contact using the `call` method.

## Example API Usage

```java
// Create a Samsung Galaxy S6 phone
SamsungGalaxyS6 phone = new SamsungGalaxyS6();

// Add two contacts
phone.addContact("1", "phone number", "first name", "last name");
phone.addContact("2", "second phone number", "
