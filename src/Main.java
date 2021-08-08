import bill.Bill;
import taxes.IncomeTaxType;
import taxes.ProgressiveTaxType;
import taxes.TaxService;
import taxes.VATaxType;

import java.math.BigDecimal;

public class Main {
		public static void main(String[] args) {
				TaxService taxService = new TaxService();
				Bill[] payments = new Bill[]{
								new Bill(new BigDecimal(100_000.77), new IncomeTaxType(), taxService),
								new Bill(new BigDecimal(1_000_000.99), new VATaxType(), taxService),
								new Bill(new BigDecimal(110_000.11), new ProgressiveTaxType(), taxService),
								new Bill(new BigDecimal(90_000.23), new ProgressiveTaxType(), taxService),
				};

				for (int i = 0; i < payments.length; ++i) {
						Bill bill = payments[i];
						bill.payTaxes();
				}
		}
}
