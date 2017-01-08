package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditPaymentPlanModel;
import org.akbank4j.core.request.CreditPaymentPlanRequest;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface ICreditPaymentPlan {

  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(String bsmv, String interest, String kkdf,
                                                               String loanStartDate, String loanUsingDate,
                                                               String loanAmount, String expenseAmount,
                                                               String term);

  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(CreditPaymentPlanRequest creditPaymentPlan);

}
