package com.design_shinbi.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 1枚のトランプカードを表すクラス。
 * このクラスは、カードのマーク（Suit）と数字（1～13）を保持します。
 */
public class Card {

    // カードのマーク（スペード、ハート、ダイヤ、クラブ）
    private Suit suit;
    
    // カードの数字（1～13）
    private int number;

    /**
     * コンストラクタ。
     * トランプカードのマークと数字を指定してカードを作成します。
     * 
     * @param suit トランプのマーク（例: スペード、ハートなど）
     * @param number トランプの数字（1: A, 11: J, 12: Q, 13: K）
     */
    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * カードのマークを取得するメソッド。
     * 
     * @return このカードのマーク（Suit列挙型）
     */
    public Suit getSuit() {
        return suit;
    }
    
    /**
     * カードの数字を取得するメソッド。
     * 
     * @return このカードの数字（1～13）
     */
    public int getNumber() {
        return number;
    }

    /**
     * 数字に対応するカードの文字列（A, J, Q, Kなど）を返すメソッド。
     * 
     * @param number カードの数字（1～13）
     * @return 対応するカードの文字列（例: 1 -> "A", 11 -> "J"）
     */
    public static String getNumberString(int number) {
        String string = null;

        // 数字に対応する文字列を返す
        if (number == 1) {
            string = "A";
        } else if (number == 11) {
            string = "J";
        } else if (number == 12) {
            string = "Q";
        } else if (number == 13) {
            string = "K";
        } else if (number >= 2 && number <= 10) {
            string = Integer.toString(number);
        }

        return string;
    }

    /**
     * カードの情報を文字列として返すメソッド。
     * 例: [スペードA], [ハートK] など
     * 
     * @return カードの文字列表現
     */
    public String toString() {
        String string = String.format(
            "[%s%s]", this.suit.getName(), getNumberString(this.number)
        );
        return string;
    }

    /**
     * トランプの全てのカード（52枚）を生成してリストで返すメソッド。
     * 
     * @return すべてのトランプカードが含まれたリスト
     */
    public static List<Card> getAllCards() {
        List<Card> list = new ArrayList<Card>();
        
        // 各マーク（Suit）ごとにカードを生成
        for (Suit suit : Suit.values()) {
            for (int number = 1; number <= 13; number++) {
                Card card = new Card(suit, number);
                list.add(card);
            }
        }

        return list;
    }
}
