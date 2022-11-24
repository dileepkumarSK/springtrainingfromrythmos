package com.paytm.entitys;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaytmBalance {

	Integer srno;
	Integer sbiBalance;
	Integer hdfcBalance;

}
