package package1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void push() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        String expected = MyContainer.to_string();
        String actual = "1 2 3 ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        int expected = MyContainer.get(1);
        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        MyContainer.remove(1);
        String expected = MyContainer.to_string();
        String actual = "1 3 ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void size() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        int expected = MyContainer.size();
        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void resize() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        int expected = MyContainer.NewContainer.length;
        int actual = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void to_string() {
        Container MyContainer = new Container();
        MyContainer.push(1);
        MyContainer.push(2);
        MyContainer.push(3);
        String expected = MyContainer.to_string();
        String actual = "1 2 3 ";

        Assert.assertEquals(expected, actual);
    }
}
