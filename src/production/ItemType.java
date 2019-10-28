package production;

/**
 * Enum ItemType is used to hold all the values for the choice box and their associated codes.
 *
 * @author: Andrew Cavallaro
 * @date: 10/28/2019
 */
public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  String code;

  /**
   * This is the constructor for the enum ItemType. It takes one parameter for the item code and
   * sets it equal to the string code field.
   *
   * @param code is used to establish what the code is for the item.
   */
  ItemType(String code) {
    this.code = code;
  }
}
