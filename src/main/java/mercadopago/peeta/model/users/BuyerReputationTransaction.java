/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadopago.peeta.model.users;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gonzalo
 */
@Getter
@Setter
@Builder
public class BuyerReputationTransaction {
    private TransactionCancelled canceled;
    private Integer completed;
    private TransactionNotyetRated not_yet_rated;
    private String period;
    private Integer total;
    private TransactionUnrated unrated;
}
