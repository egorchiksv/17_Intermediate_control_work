while True:
    com = input("Введите команду:\n1.Показать все заметки\n2.Добавить заметку\n3.Прочитать заметку\n4.Редактировать заметку\n5.Удалить заметку\n6.Выход")
    match com:
        case 1:
            view_all_notes()
        case 2:
            add_notes()
        case 3:
            read_note()
        case 4:
            edit_note()
        case 5:
            del_note()
        case 6:
            break
        case _:
            print("Неверная команда")