package org.assertj.examples.data;


/**
 * {@link BasketBallPlayer} specific assertions - Generated by me.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractBasketBallPlayerAssert} instead.
 */
public class BasketBallPlayerAssert extends AbstractBasketBallPlayerAssert<BasketBallPlayerAssert, BasketBallPlayer> {

  /**
   * Creates a new <code>{@link BasketBallPlayerAssert}</code> to make assertions on actual BasketBallPlayer.
   * @param actual the BasketBallPlayer we want to make assertions on.
   */
  public BasketBallPlayerAssert(BasketBallPlayer actual) {
    super(actual, BasketBallPlayerAssert.class);
  }

  /**
   * factory method for BasketBallPlayer assertions.
   * @return a new <code>{@link BasketBallPlayerAssert}</code>
   */
  public static BasketBallPlayerAssert assertThat(BasketBallPlayer actual) {
    return new BasketBallPlayerAssert(actual);
  }
}
