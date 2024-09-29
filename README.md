# Qafox Automation Project

## Project Overview

This project automates the testing of various functionalities on a demo e-commerce website using Selenium WebDriver, TestNG, and Maven. The tests include scenarios such as account login, address management, product search, adding products to the cart, wishlist management, product comparison, and order checkout.

## Tools and Technologies

- **Java**: Programming language for writing the test scripts.
- **Selenium WebDriver**: For automating the browser interactions.
- **TestNG**: Framework for organizing and running the test cases.
- **Maven**: Build automation tool, used to manage dependencies and run the project.
- **ChromeDriver**: WebDriver used for running the tests on Chrome browser.

## Project Structure

- **Account_Page.java**: Contains methods to automate login and account-related actions.
- **Address_Page.java**: Handles the addition and modification of user addresses.
- **Search_Page.java**: Automates the product search functionality.
- **Product_Page_One.java**, **Product_Page_Two.java**, **Product_Page_Three.java**: Automates adding various products to the cart from different product categories.
- **WishList_Page.java**: Automates the process of adding products to the wishlist.
- **Compare_Page.java**: Automates product comparison features.
- **Cart_Page.java**: Handles cart-related actions such as updating product quantities and proceeding to checkout.
- **CheckOut_Page.java**: Automates the final checkout process, including entering billing and shipping details.

## Test Cases

Each of the following test methods represents a specific user flow that is automated:

1. **AccountPage**: Automates login and account verification.
2. **AddressPage**: Automates adding a new address to the user's account.
3. **SearchPage**: Automates searching for products like iPhone.
4. **ProductPageOne**: Automates selecting a product and adding it to the cart.
5. **ProductPageTwo**: Automates adding another product to the cart.
6. **ProductPageThree**: Automates the process of adding laptops to the cart.
7. **WishListPage**: Automates adding cameras and tablets to the Wishlist.
8. **ComparePage**: Automates comparing phones and adding one phone product to the cart.
9. **CartPage**: Automates actions within the shopping cart, such as updating the product quantity and proceeding with shipping and taxes.
10. **CheckOutPage**: Completes the checkout process, including order confirmation.

## Prerequisites

- **Java JDK 8+**: Required to run the project.
- **Maven**: To manage project dependencies and run tests.
- **ChromeDriver**: Make sure to download and place the correct version of `chromedriver.exe` in your system's PATH or provide the path in the code.

## Setup and Execution

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Qafox_Automation_Project.git
   cd Qafox_Automation_Project
