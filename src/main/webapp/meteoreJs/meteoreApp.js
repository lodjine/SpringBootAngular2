
var meteoreApp = angular.module('meteoreApp', ['ui.router','ngResource']);


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
	        	templateUrl:'listProduits.html',
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
	    		url : 'formProduit',
	    		templateUrl : 'formProduit.html',
	    		controller : 'formProduit'
	    			
	        });
	        
	 
});
