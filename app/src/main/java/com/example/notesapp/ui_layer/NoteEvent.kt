package com.example.notesapp.ui_layer

import android.icu.text.CaseMap.Title
import com.example.notesapp.data_layer.Note

sealed interface NoteEvent {

    object SortNotes : NoteEvent
    data class DeleteNote(val note: Note) : NoteEvent
    data class SaveNotes(val title: String,val disp: String) : NoteEvent
}