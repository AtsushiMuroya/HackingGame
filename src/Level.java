import java.util.Scanner;

class Level implements Display{

  int level;
  int gameCount;
  Scanner sc = new Scanner(System.in);

  public void setlevel(){

  }

  public int getlevel(){
    return level;
  }

  public int gameCount(){
    if(level == 1){
      gameCount = 6;
    }else if(level == 2){
      gameCount = 5;
    }else if(level == 3){
      gameCount = 4;
    }
    return gameCount;
  }

  //ゲームレベルを選択する
  public void display(){
    //違うものを入力された場合のエラーを考える
    System.out.println("--SELECT LEVEL--");
    System.out.println("LEVEL 1 or 2 or 3");
    System.out.print("LEVEL ");
    level = sc.nextInt();

  }


}
