package taxes;

import java.math.BigDecimal;

public class VATaxType extends TaxType {

		@Override
		public BigDecimal calculateTaxFor(BigDecimal amount) {
				return amount.multiply(geRate());
		}

		public BigDecimal geRate() {
				return new BigDecimal(VAX_TAX_RATE / 100);
		}
}
