package HomeWork;

public class Rectangle {

    public int top;
    public int left;
    public int wight;
    public int height;
    public int n = Integer.parseInt(null);

    public Rectangle(int top, int left, int wight, int height) {
        this.top = top;
        this.left = left;
        this.wight = wight;
        this.height = height;

    }

    public Rectangle() {

        if (wight == n) {

            wight = 0;
            height = wight;

        } else if (height == n) {

            height = 0;
            wight = height;

        }

    }

    public Rectangle(int height) {

        if (height == n) {

        height = wight;
        left = wight;

        }

    }








}

