import list_contragent.ListContrAgent;
import communication.ListCommunicationMethod;
import contragent.ContrAgent;
import control_list_contragent.ControlListContrAgent;

public class Main{
    public static void main(String[] args) {
// создание способов связаться с контрагентами
        ListCommunicationMethod ivanListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod olgaListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod flagmanListCommunicationMethod = new ListCommunicationMethod();
        ListCommunicationMethod blackCoubListCommunicationMethod = new ListCommunicationMethod();
// Создание контрагентов
        ContrAgent ivan = new ContrAgent("Ivan", 20, ivanListCommunicationMethod);
        ContrAgent olga = new ContrAgent("Olga", 19, olgaListCommunicationMethod);
        ContrAgent flagman = new ContrAgent("Flagman",flagmanListCommunicationMethod);
        ContrAgent blackCoub = new ContrAgent("blackCoub", blackCoubListCommunicationMethod);
// распечатать по одному контрагенту
        // System.out.println(ivan);
        // System.out.println(olga);
        // System.out.println(flagman);
        // System.out.println(blackCoub);
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// создание списка контрагентов
        ListContrAgent listContragent = new ListContrAgent();
// добавление контрагентов в список контрагентов
        listContragent.addContrAgentInList(ivan);
        listContragent.addContrAgentInList(olga);
        listContragent.addContrAgentInList(flagman);
        listContragent.addContrAgentInList(blackCoub);
// распечатать список контрагентов
        // listContragent.printListContrAgent();
// Добавление способов связи
        ivanListCommunicationMethod.addVkMethod("vk/111111");
        ivanListCommunicationMethod.addVkMethod("vk/222222");
        ivanListCommunicationMethod.addAdressMethod("ул.Ленина дом 55");
        ivanListCommunicationMethod.addEmailMethod("genteel@mail.ru");
        ivanListCommunicationMethod.addTelegramMethod("@telebot");
        ivanListCommunicationMethod.addPhoneNumberMethod("72123123456");

        olgaListCommunicationMethod.addPhoneNumberMethod("2862439978");
        olgaListCommunicationMethod.addVkMethod("vk/555555");
        olgaListCommunicationMethod.addAdressMethod("ул.Петрушкина дом 2");

        flagmanListCommunicationMethod.addPhoneNumberMethod("2724356");
        flagmanListCommunicationMethod.addPhoneNumberMethod("2198499");
        flagmanListCommunicationMethod.addPhoneNumberMethod("2598882");
        flagmanListCommunicationMethod.addTelegramMethod("@flagmanTrue");
        flagmanListCommunicationMethod.addEmailMethod("flagmaGolg@mail.ru");

        blackCoubListCommunicationMethod.addVkMethod("vk/blackCoub");
        blackCoubListCommunicationMethod.addAdressMethod("ул.Воронова дом 666");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2798811");
        blackCoubListCommunicationMethod.addPhoneNumberMethod("2793300");
        blackCoubListCommunicationMethod.addTelegramMethod("@blackCoub");
        blackCoubListCommunicationMethod.addEmailMethod("Betinger@mail.ru");
//контроллер списка контрагентв
        ControlListContrAgent controlListContrAgent = new ControlListContrAgent(listContragent);
// распечатпть список контрагентов
        controlListContrAgent.printListContrAgent();
// поиск конрагентов по имени
        controlListContrAgent.serchContrAgent("Flagman");
        controlListContrAgent.serchContrAgent("Olga");
// добавить способ связи с контрагентом
        controlListContrAgent.addNewComminicationMethodPhoneNumber(flagman, "68912");
// удалить способ связи с контрагентом
        controlListContrAgent.delComminicationMethodPhoneNumber(flagman, 0);
// добавить в список нового контрагента
        // controlListContrAgent.addNewContrAgent(listContragent, newName);
    }
}
