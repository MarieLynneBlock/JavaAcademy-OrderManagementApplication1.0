# Self evaluation 3: Örder
#### Self-Evaluation 26-03 for the Java Academy by © [Cegeka/Switchfully](https://switchfully.com/) @ CM/MC

![Order Logo](order.png)

Örder is an innovative (not really) order management application. The front-end
will be a beautiful designed javascript-based application that will communicate with an even more
beautiful engineered back-end application.

It's your job to implement this back end application! Good luck and, more importantly, have Fun!

- Since this is a self evaluation exercise, work individually.

## Technical requirements

- Create a new GitHub repository
- Use REST (with JSON as the message / body format)
- Use Spring Boot
- Use Maven
- Perform logging (use spring-boot-starter's logging dependencies: logback and slf4j)
    - Certainly log all interactions with the application that can be defined as "errors"
        - E.g.: unauthorized access, illegal arguments, exceptions in general,...
- You don't have to bother about securing your endpoints (unless told otherwise): in other words, you can neglect the fact that certain endpoints
should only be usable by - for example - an administrator.

## Timing

To properly implement all the stories, in a test-first way with a proper design, an experienced developer will need around 3 - 3,5 days.
Therefore, we've created two categories of stories: Must-Have's and Nice-To-Have's. We do advice to also work on the Nice-To-Have's,
however you probably won't have the time to do this during the self-evaluation itself.

**Must-Have stories:**
- [x]  Story 0 (your project setup + other technical requirements)
- [x]  Story 1
- [x]  Story 2
- [x]  Story 3
- [x]  Story 7
- [ ]  Story 8

**Nice-To-Have stories:**
- []  Story 4
- [ ]  Story 5
- [ ]  Story 6
- [ ]  Story 9
- [ ]  Story 10

## Technical requirements

- Create a new GitHub repository
- Use REST (with JSON as the message / body format)
- Use Spring Boot
- Use Maven
- Perform logging (use spring-boot-starter's logging dependencies: logback and slf4j)
    - Certainly log all interactions with the application that can be defined as "errors"
        - E.g.: unauthorized access, illegal arguments, exceptions in general,...
- You don't have to bother about securing your endpoints (unless told otherwise): in other words, you can neglect the fact that certain endpoints
should only be usable by - for example - an administrator.

## Functional stories

The functional requirements are written down as stories.

### Story 1: Create a customer account
As an unregistered user I want to create a customer account so I can become recognized within the system.
- Upon creation of a customer, the following data should be provided:
    - Firstname
    - Lastname
    - Email address
    - Address
    - Phonenumber

### Story 2: Add an item
As an admin user I want to add an item so I can expand the list of available items.
- When adding an Item, the following data should be provided
    - Name
    - Description
    - Price
    - Amount (stock)

### Story 3: Order items
As a customer I want to order one or more items.
- An order contains one or more item groups
- An item group contains a selected item (id), an amount, and a shipping date.
    - The shipping date should be calculated automatically:
        - When we have the item in stock, the shipping date is set to the next day (of the order)
        - Otherwise the shipping date should be set to next week (day of order + 7 days)
- The total price should be calculated and shown to the customer when ordering.
- Question: should an order keep a reference to an item or should it make some sort of copy?
    - Tip: The the price of the item can change over time... What implications might this have?
- Obviously, we also need to keep track of who made the order (it has to be a known customer)

### Story 4: Update an item
As an admin user I want to update an item so I can keep my list of available items up to date.
- When updating an Item, the following data should be provided
    - Name
    - Description
    - Price
    - Amount (stock)

### Story 5: View report of orders
As a customer I want to see a report of all my orders so I can get an overview of what I ordered and how much it cost.
- The report should contain per order:
    - The id(entifier) of the order
    - Per item group of the order
        - The name of the item
        - The ordered amount
        - The total price of the item group
    - The total price of the order
- The total price of all orders

### Story 6: Reorder an existing order
As a customer I want to be able to reorder an existing order so I can quickly place a recurring order.
- Make sure this can be done by providing an order id(entifier).
- A customer can only reorder one of his own orders.
- The actual price of the item should be used, not the price the item had in the existing order.

### Story 7: View all customers
As an admin user I want to view all customers.
- List all customers known by the system

### Story 8: View a single customer
As an admin user I want to view the details of a single customers.
- Based on the customer identifier

### Story 9: Items Shipping today
As an admin user I want to view all orders that contain items that should be shipped today.
- List the item groups that should be shipped today.
- Give the address where they should be shipped to.
- Note: item groups of the same order can have a different shipping date,
but all items are shipped to the same address.

### Story 10: Item overview
As an admin user I want to have an overview of items and their stock resupply urgency so I can resupply items in a timely matter.
- To indicate the urgency of stock resupply we need to use a very business specific urgency indicator.
- There are 3 different levels for the urgency indicator:
    - STOCK_LOW
        - If item amount < 5
    - STOCK_MEDIUM
        - If item amount < 10
    - STOCK_HIGH
        -  If item amount >= 10
- The list of items should be ordered based on stock resupply urgency. Starting from most urgent to less urgent.
- I should be able to provide a filter, selecting only the items that have a certain level.
    - E.g.: Give me the list of items with urgency indicator STOCK_LOW