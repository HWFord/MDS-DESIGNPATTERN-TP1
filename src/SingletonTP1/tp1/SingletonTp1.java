package SingletonTP1.tp1;

import java.util.ArrayList;
import java.util.List;

import SingletonTP1.tp1.entities.Entity1;
import SingletonTP1.tp1.entities.Singleton;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", Singleton.getInstance().getResult().stream().count()));

    Entity1 e11 = new Entity1();
    e11.setId(15);
    e11.setData("data e1 15");

    Singleton.getInstance().getResult();

    Entity1 e12 = new Entity1();
    e12.setId(16);
    e12.setData("data e1 16");

    Singleton.getInstance().getResult();

    for (Entity1 item : Singleton.getInstance().getResult()) {
      System.out.println(item);
    }
  }

  private static List<Entity1> Singleton.getInstance().getResult(){
    List<Entity1> result = new ArrayList<Entity1>();

    for (int i = 0; i < 20; i++) {
      Entity1 e1 = new Entity1();
      //e1.setId(i % 15);
      e1.setData("data " + i);
      result.add(e1);
    }

    return result;
  }
}
