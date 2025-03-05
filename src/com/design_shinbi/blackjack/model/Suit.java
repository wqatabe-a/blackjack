package com.design_shinbi.blackjack.model;

/**
 * トランプのマークを表す列挙型。
 * これはトランプカードの4つのマーク（スペード、ハート、ダイヤ、クラブ）を定義します。
 */
public enum Suit {
    
    /**
     * スペードのマーク。
     * スペードは「♠」の記号で表され、通常は黒色です。
     */
    SPADE("スペード"),
    
    /**
     * ハートのマーク。
     * ハートは「♥」の記号で表され、通常は赤色です。
     */
    HEART("ハート"),
    
    /**
     * ダイヤのマーク。
     * ダイヤは「♦」の記号で表され、通常は赤色です。
     */
    DIAMOND("ダイヤ"),
    
    /**
     * クラブのマーク。
     * クラブは「♣」の記号で表され、通常は黒色です。
     */
    CLUB("クラブ");

    // フィールド：マークの名前を保持する変数
    private String name;
 
    /**
     * コンストラクタ。
     * 各列挙定数に対応するマーク名を設定します。
     * 
     * @param name マークの名前
     */
    private Suit(String name) {
        this.name = name;
    }
   
    /**
     * マークの名前を取得するメソッド。
     * 
     * @return この列挙定数に対応するマーク名の文字列
     */
    public String getName() {
        return this.name;
    }
}
