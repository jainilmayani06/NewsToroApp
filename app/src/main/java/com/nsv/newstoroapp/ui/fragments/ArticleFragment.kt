package com.nsv.newstoroapp.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.nsv.newstoroapp.R
import com.nsv.newstoroapp.databinding.FragmentArticleBinding
import com.nsv.newstoroapp.ui.MainActivity
import com.nsv.newstoroapp.ui.NewsViewModel


class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var newsViewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()
    lateinit var binding: FragmentArticleBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArticleBinding.bind(view)

        newsViewModel = (activity as MainActivity).newsViewModel
        val article = args.article

        binding.webView.apply {
           webViewClient = WebViewClient()

            if (article.url.isNotBlank()) {
                loadUrl(article.url)
            } else {
                // Handle the case where the URL is null or empty

                Snackbar.make(view, "Article URL is not available", Snackbar.LENGTH_SHORT).show()
            }
            /*article.url?.let {
                loadUrl(it)
            }*/
        }

        binding.fab.setOnClickListener {
            newsViewModel.addToFavourites(article)
            Snackbar.make(view, "Added to favourites", Snackbar.LENGTH_SHORT).show()
        }
    }

}