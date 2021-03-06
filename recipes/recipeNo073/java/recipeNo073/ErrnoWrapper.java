package recipeNo073;

/**
* This class will hold result and, in case of failure, errno and
* errno related error message.
*
* You should treat this class the way you treat system calls.
* If obj == null - look at errno and it's description
* If obj != null - don't treat errno as something meaningful
*
*/

public class ErrnoWrapper {

  // placeholder for errno generated by system call
  private int    errnoCode    = 0;
  private String errnoStr     = null;

  // placeholder for the result of call to JNI
  // I am storing object of Object class type
  // But you can store here something else, JNI call
  // specific.
  private Object result       = null;

  public ErrnoWrapper(Object result, int errnoCode, String errnoStr) {

    this.errnoCode = errnoCode;
    this.errnoStr  = errnoStr;
    this.result    = result;

  }

  public int getErrnoCode()   { return errnoCode; }

  public String getErrnoStr() { return errnoStr; }

  public Object getResult()   { return result; }
  
}
