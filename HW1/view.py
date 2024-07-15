import controller
def start():
    while True:
        com = input("Введите команду:\n1.Показать все заметки\n2.Добавить заметку\n3.Показать заметку\n4.Редактировать заметку\n5.Удалить заметку\n6.Выход\n")
        match com:
            case "1":
                controller.view_all_notes()
            case "2":
                controller.add_note()
            case "3":
                controller.read_note()
            case "4":
                controller.edit_note()
            case "5":
                controller.delete_note()
            case "6":
                break
            case _:
                print("Неверная команда\n")  