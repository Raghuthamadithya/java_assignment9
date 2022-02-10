import javax.swing.text.AbstractDocument;
import java.util.Arrays;

public class ComposingPredicates {
//    private void testPredicates(Trade trade)
//    {
//        //AND
//        Predicate<Trade> bigTrade =t -> t.isBigTrade();
//        Predicate<Trade> cancelledTrade = t-> t.isCancelledTrade();
//
//        Predicate<Trade> bigAndCancelledTrade =t -> t.isBigTrade() && t.isCancelledTrade();
//        Predicate<Trade> bigAndCancelledTrade2 = bigTrade.and(cancelledTrade);
//        //OR
//        Predicate<Trade> newTrade=t -> t.getStatus().equals("NEW");
//        Predicate<Trade> CancelledTrade=t -> t.getStatus().equals("CANCEL");
//        Predicate<Trade> newOrCancelledTrade=newTrade.or(cancelledTrade);
//        //AND and OR
//        Predicate<Trade> bigTrade =t ->t.isBigTrade();
//
//        Predicate<Trade> newOrCancelledButBigTrade=newTrade.or(cancelledTrade).and(bigTrade);
//        //NEGATE
//        Predicate<Trade> natANewTrade=newTrade.negate();
//        //EQUALS
//        List<Trade> trades=TradeUtil.createTraades();
//        Trade t1=new AbstractDocument.ElementEdit("GOOG",200000,"CANCEL");
//
//        Predicate<Trade> p1= Predicate.isEqual(t1);
//
//        for(Trade t :trades)
//        {
//            if(p1.test(t))
//                System.out.println("Matiching trade:"+t);
//        }
//
//    }

    public static void main(String[] args) {
        ComposingPredicates test=new ComposingPredicates();
    }
}
