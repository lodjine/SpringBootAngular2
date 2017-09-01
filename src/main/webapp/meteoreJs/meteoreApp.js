var meteoreApp = angular.module('meteoreApp', ['ui.router']);

meteoreApp.config(function($stateProvider, $urlRouterProvider) {

    

    $stateProvider.state('login', {
            url: '/login',
            templateUrl: 'index.html',
			controller: 'loginCtrl'
        }).state('accueil', {
            url: '/accueil',
            templateUrl: 'accueil.html',
        });

});

