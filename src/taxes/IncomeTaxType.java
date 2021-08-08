package taxes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IncomeTaxType extends TaxType {

		@Override
		public BigDecimal calculateTaxFor(BigDecimal amount) {
				return amount.multiply(getRate());
		}

		public BigDecimal getRate() {
				return new BigDecimal(INCOME_TAX_RATE / 100).setScale(2, RoundingMode.DOWN);
		}
}
