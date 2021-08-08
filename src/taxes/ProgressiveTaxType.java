package taxes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTaxType extends TaxType {

		@Override
		public BigDecimal calculateTaxFor(BigDecimal amount) {
				return amount.compareTo(new BigDecimal(PROGRESSIVE_TAX_LIMIT_AMOUNT)) == 1 ? amount.multiply(getMaxRate()) : amount.multiply(getMinRate());
		}

		public BigDecimal getMaxRate() {
				return new BigDecimal(PROGRESSIVE_MAX_TAX_RATE / 100).setScale(2, RoundingMode.DOWN);
		}

		public BigDecimal getMinRate() {
				return new BigDecimal(PROGRESSIVE_MIN_TAX_RATE / 100).setScale(2, RoundingMode.DOWN);
		}
}
