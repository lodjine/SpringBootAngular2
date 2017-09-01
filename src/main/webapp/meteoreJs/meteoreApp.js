var meteoreApp = angular.module('meteoreApp', ['ui.router']);

meteoreApp.config(function($stateProvider, $urlRouterProvider) {


	 $urlRouterProvider.otherwise('/accueil');
	    
	 $stateProvider
	        
	        .state('listmagasins', {
	            url: '/listmagasins',
	            templateUrl: 'listmagasins.html',
	            controller: 'listmagasinsCtrl'
	           
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
	        	url: 'formMagasin',
	        	templateUrl:'formMagasin.html',
	        	controller:'formMagasinCtrl'
	        	
	        });
	        
	});

	
	


