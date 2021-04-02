class kadai2 {
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);

    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);

    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12/4 == 3);

    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12/4 != 3);

    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3 * 9 == 27;

    // 変数boolの値を出力してください
    System.out.println(bool);

    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    }

    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
      System.out.println("xは8より大きい");
    }

    int number = 12;

    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }

    /////////////////////////////switch//////////////////////////////////////

    switch (number % 3) {
      case 0:
        System.out.println("3で割り切れます");
        break;

      case 1:
      System.out.println("3で割ると1余ります");
      break;

      case 2:
        System.out.println("3で割ると2余ります");
        break;
    }

    int number1 = 13;

    // defaultを用いて、どのcaseにも合致しない場合の処理を記述してください
    switch (number1 % 5) {
      case 0:
        System.out.println("大吉です");
        break;
      case 1:
        System.out.println("中吉です");
        break;

      case 4:
        System.out.println("凶です");
        break;

      default:
       System.out.println("吉です");
       break;
    }
    //////////////////////while///////////////////////
    int number2 = 10;

    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while (number2 > 0) {
      System.out.println(number2);
      number2 --;
    }

    //////////////////////////for////////////////////////
    // for文を用いて、繰り返し処理をつくってください
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "回目のループです");
    }
    
    /////////////////繰り返し終了ーーーーーーーーーbreak---------///////////////////
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i % 5 == 0) {
        break;
      }
      
      System.out.println(i);
      i++;
    }
    //////////////スキップ/////////////------------------continue--------------------////////////////////
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j % 3 == 0) {
        continue;
      }
      
      System.out.println(j);
    }
    
    
    
    
    
    
    
    
    
    
    
    /////////////////////////配列////////////////////////////
    // 変数namesに、配列を代入してください
    String[]names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};
    
    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);
    
    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);
    
    // 変数languagesを定義し、配列を代入してください
    String[]languages = {"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書きしてください         ///変数は上書きできる//////////////
    languages[1] = "Java";
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int k = 0; k < names.length; k++) {
      System.out.println("私の名前は" + names[k] + "です");
    }
    
    for (String name:names) {
      System.out.println("私の名前は" + name + "です");    /////////////for各長文///////////////////
    }
    
    
    
    
    
    
    //////////////////////////////最終課題//////////////////////////
    int numbers[] = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for (int num:numbers) {
      if ( num % 2 == 0) {
        evenSum += num;
      }
      else {
        oddSum += num;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  

  }
}