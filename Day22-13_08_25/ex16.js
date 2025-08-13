let images = [
        "im1.jpg",
        "im2.jpg",
        "im4.jpg",
        "gold.jpg",
        "im5.jpg",
        "jhu.webp",
        "kundan.webp"

    ];
    let currentIndex = 0;

    function showImage() {
        document.getElementById("gallery").src = images[currentIndex];
    }
     function nextImage() {
        currentIndex++;
        if (currentIndex >= images.length) {
            currentIndex = 0; 
        }
        showImage();
    }
    function prevImage() {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = images.length - 1; 
        }
        showImage();
    }
    showImage();