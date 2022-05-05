package com.naldana.dummydictionary.repository
import androidx.lifecycle.MutableLiveData
import com.naldana.dummydictionary.data.dao.AntonymDao
import com.naldana.dummydictionary.data.dao.SynonymDao
import com.naldana.dummydictionary.data.dao.WordDao
import com.naldana.dummydictionary.data.model.Word

class DictionaryRepository(private val wordDoa: WordDao,
                           val synonymDao: SynonymDao,
                           val antonymDao: AntonymDao
) {
    fun getAllWords() = wordDoa.getAllWords()

    suspend fun addWord(word: Word) {
        wordDoa.insertWord(word)
    }
}