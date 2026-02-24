package com.tt1.test;

public class Repositorio {
        private DBStub db;

        public Repositorio(DBStub db) {
            this.db = db;
        }

        public ToDo findToDo(String nombre) {
            return db.getToDo(nombre);
        }

        public boolean markToDoAsCompleted(String nombre) {
            ToDo todo = db.getToDo(nombre);
            if (todo != null) {
                todo.setCompletado(true);
                db.updateToDo(nombre, todo);
                return true;
            }
            return false;
        }
        public void storeToDo(ToDo todo) {
            db.addToDo(todo);
        }

        public void storeEmail(String email) {
            db.addEmail(email);
        }
}
