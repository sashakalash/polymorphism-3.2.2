package taxes;

import java.math.BigDecimal;

public class TaxType {
		protected final static int PROGRESSIVE_TAX_LIMIT_AMOUNT = 100_000;
		protected final double VAX_TAX_RATE = 18.00;
		protected final double INCOME_TAX_RATE = 13.00;
		protected final double PROGRESSIVE_MIN_TAX_RATE = 10.00;
		protected final double PROGRESSIVE_MAX_TAX_RATE = 15.00;

		public BigDecimal calculateTaxFor(BigDecimal amount) {
				return new BigDecimal(0.0);
		}
}
