
var meteoreApp = angular.module('meteoreApp', ['ui.router','ngResource','ui.bootstrap']);

meteoreApp.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/accueil');


	    
	 $stateProvider
	        
	        .state('listMagasins', {
	            url: '/listMagasins',
	            templateUrl: 'listMagasins.html',
	            controller: 'listMagasinsCtrl'
	           
	        })
	        
	        .state('accueil', {
            url: '/accueil',
            templateUrl: 'accueil.html',
        })
	        
	    .state('listProduits', {
	        	url: '/listProduits',
	        	templateUrl:'listProduit.html',
	        	controller:'listProduitsCtrl'	        	
	           
	        })
	        
	        .state('formMagasin', {
	        	url: '/formMagasin',
	        	templateUrl:'formMagasin.html',
	        	controller:'formMagasinCtrl'
	        	
	        }).state('listCategories', {
	        	url: '/listCategories',
	        	templateUrl:'listcategories.html',
	        	controller:'listcategoriesCtrl'	        	

	        }).state('formProduit', {
	    		url : '/formProduit',
	    		templateUrl : 'formProduit.html',
	    		controller : 'formProduitCtrl'
	    			
	        }).state('detailProduit', {
	    		url : '/detailProduit/:id',
	    		templateUrl : 'formProduit.html',
	    		controller : 'formProduitCtrl'
	    			
	        }).state('listFournisseur', {
	url : '/listFournisseur',
	templateUrl : 'listFournisseur.html',
	controller : 'listFournisseurCtrl'
		
}).state('formFournisseur', {
	url : '/formFournisseur/:id',
	templateUrl : 'formFournisseur.html',
	controller : 'formFournisseurCtrl'
		
}).state('selectMagasins', {
	url : '/selectMagasins',
	templateUrl : 'selectMagasins.html',
	controller : 'gestionCtrl'
		
}).state('DialogCommande', {
	url : '/DialogCommande',
	templateUrl : 'DialogCommande.html',
	controller : 'DialogCtrl'
	 
	 
	        
}).state('pageUne', {
	url : '/pageUne',
	templateUrl : 'pageUne.html'
	 
	 
	        
});	 
	 
	 
	 
});

