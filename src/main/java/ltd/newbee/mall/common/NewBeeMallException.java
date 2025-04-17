
package ltd.newbee.mall.common;

public class NewBeeMallException extends RuntimeException {

    public NewBeeMallException() {
    }

    public NewBeeMallException(String message) {
        super(message);
    }

    
    public static void fail(String message) {
        throw new NewBeeMallException(message);
    }

}
