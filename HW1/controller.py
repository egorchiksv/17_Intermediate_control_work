import model
import datetime

notes = model.load_notes()
def view_all_notes():
    for note in notes:
        print(f"Заметка №{note['id']}. {note['title']} ({note['date']})\n{note['body']}\n")

def add_note():
    title = input("Введите заголовок заметки: ")
    body = input("Введите тело замтки: ")
    id_note = len(notes)+1
    date_note = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    notes.append({"id": id_note, "title": title, "body": body, "date": date_note})
    model.save_notes(notes)
    print("Заметка успешно сохранена")
    
def read_note():
    filter_date = input("Введите дату для фильтрации (в формате ГГГГ-ММ-ДД): ")
    if not notes:
        print("Заметок нет")
        return
    if not filter_date:
        for note in notes:
            print(f"{note['id']}. {note['title']} ({note['date']})\n{note['body']}\n")
    else:
        filtered_notes = [note for note in notes if note["date"].startswith(filter_date)]
        if filtered_notes:
            for note in filtered_notes:
                print(f"{note['id']}. {note['title']} ({note['date']})\n{note['body']}\n")
        else:
            print("Заметок с указанной датой нет")
            
def edit_note():
    id_note = int(input("Введите id заметки: "))
    for note in notes:
        if note["id"] == id_note:
            title = input(f"Введите новый заголовок заметки ({note['title']}): ")
            body = input(f"Введите новое тело заметки ({note['body']}): ")
            if title:
                note["title"] = title
            if body:
                note["body"] = body
            note["date"] = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")

            print("Заметка успешно отредактирована")
            return
    model.save_notes(note)
    print(f"Заметка с id {id_note} не найдена")
    
def delete_note():
    id_note = int(input("Введите id заметки для удаления: "))
    for note in notes:
        if note["id"] == id_note:
            notes.remove(note)
            model.save_notes(notes)
            print("Заметка успешно удалена")
            return
    print(f"Заметка с id {note_id} не найдена")