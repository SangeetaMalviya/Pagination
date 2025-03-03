Summary
Created an android app using MVVM that calls the following API - https://api.thecatapi.com/v1/images/search?limit=100&page=10&order=Desc
where limit = page size and page = page no
It display the image in a paginated (endless scrolling) format with the layout as a staggered grid layout.
This program includes the following libraries - Retrofit, Dagger (optional) and Glide/Picasso.

Added dependencies (Retrofit, Glide, ViewModel).
Added INTERNET permission in AndroidManifest.xml.
Created Model (CatImage.kt).
Created API Service (ApiService.kt).
Created Retrofit Singleton (RetrofitInstance.kt).
Created Repository (CatImageRepository.kt).
Created ViewModel (CatImageViewModel.kt).
Created ViewModelFactory (CatImageViewModelFactory.kt).
Created RecyclerView Adapter (CatImageAdapter.kt).
Created UI (activity_main.xml, item_layout.xml).
Setup ViewModel & RecyclerView in MainActivity.kt.
Observed data and displayed cat images.
