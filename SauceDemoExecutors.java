package SauceDemo;

public class SauceDemoExecutors {

    KeyWordImplementation k = new KeyWordImplementation();

    public void executors(String keyword) throws InterruptedException {

        if (keyword.equals("LAUNCH_BROWSER")) {
            k.launchBrowser();
        }

        else if (keyword.equals("OPEN_URL")) {
            k.openurl();
        }

        else if (keyword.equals("USERNAME")) {
            k.username();
        }

        else if (keyword.equals("PASSWORD")) {
            k.password();
        }

        else if (keyword.equals("LOGIN_BUTTON")) {
            k.loginbutton();
        }

        else if (keyword.equals("ADD_TO_CART")) {
            k.addToCart();
        }

        else if (keyword.equals("CART")) {
            k.cart();
        }

        else if (keyword.equals("CHECKOUT")) {
            k.checkout();
        }

        else if (keyword.equals("FIRST_NAME")) {
            k.firstName();
        }

        else if (keyword.equals("LAST_NAME")) {
            k.lastName();
        }

        else if (keyword.equals("POSTAL_CODE")) {
            k.postalCode();
        }

        else if (keyword.equals("CONTINUE")) {
            k.continueButton();
        }

        else if (keyword.equals("FINISH")) {
            k.finish();
        }

        else if (keyword.equals("CLOSE_BROWSER")) {
            k.closeBrowser();
        }
    }
}
