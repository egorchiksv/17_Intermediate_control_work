while True:
    com = input("Введите команду:\n1.Показать все заметки\n2.Добавить заметку\n3.Прочитать заметку\n4.Редактировать заметку\n5.Удалить заметку\n6.Выход\n")
    match com:
        case "1":
            print("Введена цифра 1")
            # view_all_notes()
        case "2":
            print("Введена цифра 2")
            # add_notes()
        case "3":
            print("Введена цифра 3")
            # read_note()
        case "4":
            print("Введена цифра 4")
            # edit_note()
        case "5":
            print("Введена цифра 5")
            # del_note()
        case "6":
            break
        case _:
            print("Неверная команда\n")