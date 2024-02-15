package com.nsv.newstoroapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nsv.newstoroapp.R
import com.nsv.newstoroapp.adapters.NewsAdapter
import com.nsv.newstoroapp.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment(R.layout.fragment_category) {

    lateinit var binding: FragmentCategoryBinding
    lateinit var newsAdapter: NewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCategoryBinding.bind(view)

    }
}